# 抽象工厂模式在Collection中的应用

##### Collection接口、Iterator接口、ArrayList类和部分源码
    
    public interface Collection<E> extends Iterable<E> {
       
        Iterator<E> iterator();
    
    }
    ————————————————————————————————————————
    public interface Iterator<E> {
    }
    
    ————————————————————————————————————————
```    public class ArrayList<E> extends AbstractList<E>
            implements List<E>, RandomAccess, Cloneable, java.io.Serializable
    {

        public Iterator<E> iterator() {
                return new Itr();
            }
            
        private class Itr implements Iterator<E> {
        
            Itr() {}
        }
    }```

    
##### Iterator<E> iterator();方法
        对于Iterator<E> iterator();方法，Collection接口就是一个抽象工厂，每一个实现了Collection接口的类
    都有一种不同的实例对象，ArrayList类最终实现了Collection接口，ArrayList中的私有类Itr实现了Iterator接口。
    
