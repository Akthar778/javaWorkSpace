class privatee {
    private int a = 10;
    public int k = 1837;

    private void method() {
        System.out.println("this is method one" + a);
    }

    private privatec() {
        a = 99;
    }

    private static void main(String[] args) {
        privatec obj = new privatec();

    }
}
