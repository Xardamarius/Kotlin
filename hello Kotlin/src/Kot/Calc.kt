package Kot

class Calc {

    companion object{
//        private static final float PI = 3.14
//        public float getPI() {
//            return PI;
//        }
//        public static final float PI...
//        const val PI = 3.14
        const val PI = 3.14
//        get() = field * 2
        fun square(num: Int) = num * num
//        fun lengthOfCircle(radius: Float) = 2 * 3.14 * radius
        fun lengthOfCircle(radius: Float) = 2 * PI * radius
    }

}