### Spring Profiles를 이용한 운영/개발 환경 구분

#### Activated Profiles 확인
    http://localhost:8080/profiles

#### 세팅방법
    Profiles별 application-{profile}.properties 작성 (ex : application-dev.properties)
    현 프로젝트의 경우 dev가 default로 세팅되어있음.
    application.properties -> spring.profiles.active=dev
    
#### JAR 구동방법
    java -jar fileName.jar -Dspring.profiles.active={profile}
    ex) java -jar demo.jar -Dspring.profiles.active=dev    
    
#### WAR 구동 방법
    1. web.xml - active-profile 설정
        <context-param>
            <param-name>spring.profiles.active</param-name>
            <param-value>prod</param-value>
        </context-param>
    2. catalina.sh 설정
        JAVA_OPTS="$JAVA_OPTS -Dspring.profiles.active=prod"
    3. catalina.properties 에 추가 (D 빼는 것 주의)
        spring.profiles.active=dev
        
#### 참고자료
https://ethank.tistory.com/entry/%EC%8A%A4%ED%94%84%EB%A7%81-%ED%94%84%EB%A1%9C%ED%8C%8C%EC%9D%BC-Spring-profile-%EC%9D%84-%ED%86%B5%ED%95%B4-%ED%99%98%EA%B2%BD%EB%B3%84%EB%A1%9C-%EB%8B%A4%EB%A5%B8-%EC%84%A4%EC%A0%95%EC%9D%84-%ED%95%B4%EB%B3%B4%EC%9E%90