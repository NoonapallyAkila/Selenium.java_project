package JavaPractice;

public class generics<T> {
	
	private T value;

    public void setValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public static void main(String[] args) {
        generics<String> stringBox = new generics<>();
        stringBox.setValue("Hello Generics");
        System.out.println("String value: " + stringBox.getValue());

        generics<Integer> intBox = new generics<>();
        intBox.setValue(123);
        System.out.println("Integer value: " + intBox.getValue());
    }

}
