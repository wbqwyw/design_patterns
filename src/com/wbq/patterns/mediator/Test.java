package com.wbq.patterns.mediator;

/**
 * @ClassName Test
 * @Description 中介者模式-测试类
 * @Author wbq
 * @Date 2021/1/2 22:11
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        MediatorStructure mediatorStructure = new MediatorStructure();
        HouseOwner houseOwner = new HouseOwner("张三", mediatorStructure);
        Tenant tenant = new Tenant("李四", mediatorStructure);
        mediatorStructure.setHouseOwner(houseOwner);
        mediatorStructure.setTenant(tenant);
        tenant.contact("我需要租房");
        houseOwner.contact("我有房子");
    }
}
