## MVVMpratice_android
[Youtuber VickingDev's MVVM app tutorial](https://www.youtube.com/watch?v=b6tWQVVW3a0&list=PL5k-fzl-OswNmVm-tV5eB6eeOFpjNO5jM&index=1)<br>
위의 영상을 보고 따라하면서 안드로이드 mvvm을 연습하려고 합니다. VickingDev님께 감사합니다.<br>
유트버님의 구성에 의하면 'MVVM base-SharedPreferences-LiveData-Single Event' 순서로 진행됩니다.

## MVVM base
### 1. MainApplication.kt
[이에 대해 알기 위해 찾아보게 된 블로그 주소](https://medium.com/droid-log/android-application-class-a8a1d64c82d1)<br>
Activity Life Cycle은 실행 중에 activity의 단계들이고, lifecycle을 아는 것은 깊은 개발을 할 때 중요합니다.
Application class는 Activities나 Services같은 구성요소들을 팜하는 Android app의 기본 클래스입니다.
Application이나 그것의 하위 클래스들은 모든 activities나 다른 application object가 Android App에서 만들어지기 전에 초기화 되어집니다.<br>

application class를 import하거나 extend(상속)할 필요 없습니다. application class는 이미 정의되어 있습니다.
우리는 application class를 바꿀 수 없지만, 그것을 상속받으면서(extend) 추가적인 지시사항을 줄 수 있습니다.<br>

```kotlin
class MainApplication : Application() {
    // 이 메소드를 재정의하는 것은 '선택사항'이다.
    override fun onCreate() {
        super.onCreate()
        // 초기화 로직이 여기에 작성된다.
    }
}
```
위와 같이 작성되고 나서는 AndroidManifest.xml에 들어가서 Application의 이름이 우리가 만든 MainApplication이 되도록 수정해줍니다.
```xml
<application
        android:name=".MainApplication"
        ...>
```
어떤 activity가 현재 작동중인지 알아야만하고 우리의 모든 엑티비티에서 네트워크 리시버가 등록되어야 하는 상황이라 가정하자.
이를 위해, 우리는 모든 엑티비티에 같은 코드를 작성하거나 기본 클래스를 작성해서 상속했다. 하지만 이는 코드의 중복이 발생하고, 유지보수가 어렵다.
이를 해결하기 위해 Application 클래스를 사용한다. Application 클래스는 앱의 모든 컴포넌트들이 공유하는 전역 상태를 저장하는데 사용된다.



