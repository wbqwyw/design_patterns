package com.wbq.patterns.mediator;

/**
 * @ClassName Test
 * @Description �н���ģʽ-������
 * @Author wbq
 * @Date 2021/1/2 22:11
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        MediatorStructure mediatorStructure = new MediatorStructure();
        HouseOwner houseOwner = new HouseOwner("����", mediatorStructure);
        Tenant tenant = new Tenant("����", mediatorStructure);
        mediatorStructure.setHouseOwner(houseOwner);
        mediatorStructure.setTenant(tenant);
        tenant.contact("����Ҫ�ⷿ");
        houseOwner.contact("���з���");
    }
}
