## 1일차

https://docs.spring.io/

- 프로젝트 생성 (spring initializr)
    - **maven과 gradle**: 빌드 자동화 도구
    - gradle이 maven보다 빌드 속도가 빠르고 동적이다. (프로그래밍 가능)
    - **tymeleaf:** 표준 뷰 템플릿
- 파일
    - **build.gradle**: 버전 설정, 라이브러리 로드
    - **gradlew**:
    - **gradlew.bat**:
    - **external libraries**: build.gradle에 존재하는 의존 관계들이 또 필요한 의존 관계들이 들어있음
    - spring-boot-starter를 통해 스프링을 시작하는데 필요한 라이브러리들이 다 불러와짐
    - syso로 출력하면 안되고 log로 남겨야됨 (starter-logging)
        - logback, sl4j 등 조합
    - junit, assertj, mockito 등은 test를 도와주는 라이브러리 (starter-test)
- view 환경 설정
    - **index.html**: welcome page
    - **web application의 첫번째 진입점**: controller
    - **controller의 @getmapping(get)**: 해당 endpoint(url로 표시되는 곳)로 넘어가면 attribute name에 해당되는 value를 반환. **return 값이 의미하는 것은 어느 html 파일과 이어줄지, 이 화면을 실행시켜라** (tymeleaf 엔진이 처리)
        - gemapping url로 하면 return을 실행시켜라 (resources:templates/ {ViewName}.html)
- 빌드하고 실행
    - 위치로 이동
    - gradlew.bat build
    - cd build
    - cd libs
    - dir /a
    - java -jar {spring jar 파일}
