# cryptocurrency-price-data
Get cryptocurrency price data with spring batch


## 요구사항

관심 가상화폐의 실시간 가격을 조회하영 슬랙으로 알림메시지 발송 </br>
발송한 내역을 데이터베이스에 저장 </br>

</br>

업비트에서 데이터를 조회할 수 있다 -> restTemplate, feignClient </br>
조회한 데이터를 슬랙으로 메시지를 전송한다 -> slack api, webhook </br>
해당 기능은 정기적으로 수행되어야 한다 -> gitbut action, springBatch </br>
인메모리 데이터 베이스는 사용할 수 없다 -> mysql 사용 </br>
데이터베이스 조회 시에는 jpa와 querydsl을 사용한다 </br>
