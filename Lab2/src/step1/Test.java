package step1;

public class Test {

	public static void main(String[] args) {
		Histogram h1 = new Histogram(5);
		for(int i = 0; i<5; ++i)
            for(int j = 0; j < i;++j)
                h1.add(i);
		h1.display("l");
        h1.display("s");
		System.out.println(h1.toString());
	}
}

