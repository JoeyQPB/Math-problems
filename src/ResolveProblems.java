public class ResolveProblems {
    public double deltaBhaskara(double a, double b, double c) {
        double deltaSqrt = Math.sqrt(Math.pow(b, 2) - 4 * a * c);
        return ((b + deltaSqrt) / 2*a) + ((b - deltaSqrt) / 2*a);
    }
    public double triangleRectangleArea(double base, double height) {
        return (base * height) / 2;
    }
    public double trapezeArea(double height, double bigBase, double minorBase) {
        return ((bigBase + minorBase) * height) / 2;
    }
    public double fibonacci(int position) {
        if(position == 0 || position == 1) return position;
        return fibonacci(position - 1) + fibonacci(position - 2);
        /*
        int a = 1;
        int aux, b = 0;
        for(int i = 0; i < position; i++){
            aux = a;
            a += b
            b = aux;
        }
        return a
        */
    }
    public double binarySearch(int arrayLength, int number) {
        int[] arr = new int[arrayLength];
        int start = 0, end = arrayLength - 1, middle, find = 0, count = 0;

        for (int i = 0; i < arrayLength; i++) {
            arr[i] = i;
        }

        while (start <= end) {
            count++;
            middle = (end + start) / 2;
            if(arr[middle] == number) {
                find = arr[middle];
                break;
            } else if (number > middle) {
                start = middle + 1;
            } else {
                end = middle - 1;
            }
        }

        System.out.println(count);
        return find;
    }
}