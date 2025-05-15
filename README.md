# 결제위젯 Java 샘플 프로젝트

토스페이먼츠 결제위젯을 사용한 간단한 결제 프로젝트입니다. 결제위젯은 토스페이먼츠만의 기본 결제서비스로, 수많은 상점을 분석해서 만든 최적의 주문서 결제 UI예요.

## 실행하기

1. IntelliJ로 샘플 프로젝트를 빌드하고 실행하세요.

2. http://localhost:4242 에서 샘플 프로젝트를 확인하세요.

## 인증하기

샘플에 있는 키로 연동이 가능하지만, 내 테스트 연동 키를 사용하면 테스트 결제내역, 웹훅 기능을 사용할 수 있어요. 내 테스트 연동 키는 [개발자센터](https://developers.tosspayments.com/my/api-keys)에서 확인할 수 있습니다. 더 자세한 내용은 [API 키 가이드](https://docs.tosspayments.com/reference/using-api/api-keys)를 참고하세요.

- **클라이언트 키**: `src/main/resources/templates/checkout.html` 파일에 있는 `clientKey`를 내 결제위젯 클라이언트 키로 수정하세요.
- **시크릿 키**: `src/main/java/com/example/demo/controller/WidgetController.java` 파일에 있는 `secretKey`를 내 결제위젯 시크릿 키로 수정하세요. **시크릿 키는 외부에 노출되면 안 됩니다.**
