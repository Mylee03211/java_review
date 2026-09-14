package org.review;

public class 泛型 {
//    泛型就是把类型参数化，由于Java需要给数据指定类型，因此如果我们写死一个类型，那么就很不方便。
//    但是如果能够将类型参数化,这样用户就可以自己定义数据的类型.
    static class Box<T>{
        private T value;
        public void setValue(T value){
            this.value = value;
        }

        public T getValue(){
            return value;
        }

    public static void main(String[] args) {
        Box<String> box = new Box();
        box.setValue("123");
        String box_container = box.getValue();
        System.out.println(box_container);
    }


}
}