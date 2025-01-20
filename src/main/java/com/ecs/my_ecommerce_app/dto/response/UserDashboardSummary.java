package com.ecs.my_ecommerce_app.dto.response;
import com.ecs.my_ecommerce_app.dto.CouponDTO;
import com.ecs.my_ecommerce_app.dto.NotificationDTO;
import com.ecs.my_ecommerce_app.dto.PaymentMethodDTO;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.math.BigDecimal;
import java.util.List;


@Getter
@Setter
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserDashboardSummary {

    @JsonProperty("user_id")
    private Long userId;

    @JsonProperty("total_orders")
    private Integer totalOrders;

    @JsonProperty("total_amount")
    private BigDecimal totalSpent;

    @JsonProperty("wishlist_count")
    private Integer wishlistCount;

    @JsonProperty("cart_items_count")
    private Integer cartItemsCount;

    @JsonProperty("recent_orders")
    private List<OrderSummary> recentOrders;

    @JsonProperty("unread_notifications")
    private List<NotificationDTO> unreadNotifications;

    @JsonProperty("active_coupons")
    private List<CouponDTO> activeCoupons;

    @JsonProperty("saved_payment_methods")
    private List<PaymentMethodDTO> savedMethodMethods;


}
