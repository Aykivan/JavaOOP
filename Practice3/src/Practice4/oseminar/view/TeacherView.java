package Practice4.oseminar.view;

import Practice4.oseminar.data.Student;
import Practice4.oseminar.data.StudentGroup;
import Practice4.oseminar.data.Teacher;

import java.util.List;
import java.util.logging.Logger;

public class TeacherView implements UserView<Teacher> {

    Logger logger = Logger.getLogger(StudentView.class.getName());

    @Override
    public void sendOnConsole(List<Teacher> teachers) {
        for(Teacher user: teachers){
            logger.info(user.toString());
        }
    }

    public void sendOnConsoleUserGroup(Teacher teacher){
        logger.info(teacher.toString());
    }
}
