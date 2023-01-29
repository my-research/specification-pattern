# 알림

notification 에 따른 알림 시스템을 만들어라

# notification 의 종류

- **sms type**
  - email
  - phone number
- **번호의 형태**
  - +82 라면 대한민국 sender
  - +1 이라면 미국 sender

# notifier 의 종류

- twilio (미국 번호이면서 SMS 타입의 notification)
- NHN toast (한국 번호이면서 SMS 타입의 notification)
- Senders (한국 번호이면서 SMS 타입이며 문자열의 길이가 30자 이내면 무료로 전송해줌)
