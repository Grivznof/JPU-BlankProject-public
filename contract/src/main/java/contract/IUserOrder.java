package contract;

import contract.Order;

public interface IUserOrder {
    int getPlayer();

    Order getOrder();
}