package com.example.demo.order.service;

import org.springframework.stereotype.Service;

@Service
public class OrderService {

    public void checkAmount(String orderId, String amount) {
        // 해당 주문번호의 최종 결제금액이 정말 ammount와 일치하는지 확인하는 로직이 들어갑니다.

        boolean matched = true;

        // 만약 일치하지 않는다면, 예외를 발생시킵니다.
        if ( !matched ) throw new RuntimeException("결제금액이 일치하지 않습니다.");

    }


    public void setPaymentComplete(String orderId) {
        // 결제 완료 처리 로직이 들어갑니다.
        // 예를 들어, DB에 결제 완료 상태로 업데이트하는 등의 작업을 수행합니다.
    }
}
