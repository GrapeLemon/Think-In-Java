package _10_innerclass._06_anonymous;

import _10_innerclass._04_innerAndUpcast.Destination;

/**
 * @Author wx-li
 * @Date 2019/8/28 13:31
 * Using "instance initialization" to perform
 * construction on an anonymous inner class
 * 作者说参数必须得是final的，但是现在不用也行了,用低版本的编译器试试就知道了
 * 经常尝试后发现 jdk8开始就不用了，但是之前的版本确实是要定义为final才允许编译
 **/
public class Parcel10 {
    public Destination destination(String dest, float price) {
        return new Destination() {
            private int cost;
            //Instance initialization for each object
            //这样的写法叫做作用域，记清楚不要和“域”搞混了
            {
                cost = Math.round(price);
                if(cost > 100) System.out.println("Over budget!");
            }

            private String label = dest;
            public String readLabel(){return label;}
        };
    }

    public static void main(String[] args) {
        Parcel10 P = new Parcel10();
        Destination d = P.destination("Tasmania", 101.395f);
    }
}

