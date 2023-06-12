package jpabook.japshop.domain;



import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;


import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "orders")
@Getter @Setter
public class Order {

	@Id @GeneratedValue
	@Column(name = "order_id")
	private Long Id;
	
	@ManyToOne
	@JoinColumn(name = "member_id")
	private Member member;
	
	private List<OrderItem> orderItems = new ArrayList<>();
	
	private Delivery delivery;
	
	private LocalDateTime orderDate; // 주문시간
	
	private OrderStatus status; //주문상태 취소,주문
}
