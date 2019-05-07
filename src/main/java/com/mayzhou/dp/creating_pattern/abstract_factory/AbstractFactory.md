# Abstract Factory 抽象工厂模式
##### 根据原则
    LSP原则（里氏替换原则）
        LSP讲的是基类和子类的关系。只有当这种关系存在时，里氏替换关系才存在。
        LSP：子类型必须能够替换它们的基类型
##### 定义
    为创建一组相关或相互依赖的对象提供一个接口，而且无需指定他们的具体类。
##### 简介
        当每个抽象产品都有多于一个的具体子类的时候，工厂角色怎么知道实例化哪一个子类呢？
    比如每个抽象产品角色都有两个具体产品。抽象工厂模式提供两个具体工厂角色，分别对应于这
    两个具体产品角色，每一个具体工厂角色只负责某一个产品角色的实例化。每一个具体工厂类只
    负责创建抽象产品的某一个具体子类的实例。