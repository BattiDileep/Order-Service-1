package com.example.Order.Mapper;

import com.example.Order.DTO.OrderDTO;
import com.example.Order.Entity.Order;

public class OrderMapper {
	public static OrderDTO mapToOrderDTO(Order order) {
		
		return new OrderDTO(
				order.getOrderId(),
				order.getOrderName(),
				order.getOrderQty(),
				order.getOrderDeliveryLocation());
	}
	public static Order mapToOrder(OrderDTO orderdto) {
		return new Order(
				orderdto.getOrderId(),
				orderdto.getOrderName(),
				orderdto.getOrderQty(),
				orderdto.getOrderDeliveryLocation());
	}

}
