package Practice4.oseminar;

import Practice4.oseminar.data.Student;
import Practice4.oseminar.data.Teacher;
import Practice4.oseminar.data.UserComparator;
import Practice4.oseminar.service.TeacherService;
import Practice4.oseminar.view.StudentView;
import Practice4.oseminar.view.TeacherView;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {

        /**
         * - Создать класс Юзер и перенести его в базовые поля (ФИО)
         * - Модифицировать ранее созданный класс СтудентКомпаратор
         * - Переименовать в ЮзерКомпаратор
         * - Типизировать его T наследующегося от типа Юзер
         * - Типизировать реализуемый интерфейс Компаратор T
         * - Изменить метод компаре, внеся во входные данные вместо конкретных классов типизацию T
         * - Внести правки места, где использовался предыдущий компаратор
         */

        Teacher teach1 = new Teacher("t1","t1","t1","t1");
        Teacher teach2 = new Teacher("t2","t2","t2","t2");
        UserComparator<Teacher> compt = new UserComparator<>();
        System.out.println(compt.compare(teach1, teach2));

        /**
         * - Модифицировать ранее созданный класс ЮзерВью
         * - Сделать его интерфейсом
         * - Типизировать его T наследующегося от типа Юзер
         * - Внести в метод sendOnConsole типизацию
         * - Создать класс СтудентВью реализующий созданный интерфейс
         * - Внести правки в метод sendOnConsole согласно типизации
         * - Перенести в него ранее созданные другие методы(включая те, которые могли быть созданы в процессе домашней работы)
         */

        StudentView studentView = new StudentView();
        studentView.sendOnConsole(List.of(new Student("FN","SN","PN","21")));
        System.out.println("-------------------------------------------------------------------------------------------");

        /**
         * Home Work
         * - Создать класс УчительСервис и реализовать аналогично проделанному на семинаре
         * - Создать класс УчительВью и реализовать аналогично проделанному на семинаре
         */

        TeacherService teacherService = new TeacherService();
        teacherService.create("Fn","Sn","Pn","Dd");
        System.out.println("teacherService");
        System.out.println(teacherService.getAll());

        System.out.println("-------------------------------------------------------------------------------------------");

        TeacherView teacherView = new TeacherView();
        System.out.println("teacherView");
        teacherView.sendOnConsole(List.of(new Teacher("Fn","Sn","Pn","Dd")));
    }
}
