public class sotrudniki {
    public static void main(String[] args) {
        System.out.println("Задача о количестве сотрудников на проекте");

        int prog = 100;
        System.out.println("количество программистов "+prog);

        int test = 2;
        System.out.println("количество специалистов поддержки, необходимое, чтобы обработать вопросы, возникающие у пользователей по поводу кода, написанного одним программистом "+test);

        int col =3;
        System.out.println("количество специалистов поддержки "+col);

        int res = prog * test;
        System.out.println("количество тестировщиков, требуемое на проекте "+res);

        int res1 = prog * col;
        System.out.println("количество специалистов поддержки "+res1);

        int res3 = res + res1 + prog;
        System.out.println("общее количество технических специалистов на проекте "+res3);




    }
}
