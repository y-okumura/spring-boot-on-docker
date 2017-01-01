package jp.co.nichiwa_system.example.tasks

import org.apache.ibatis.annotations.*

@Mapper
interface TaskMapper {
    @Select('select * from TASK')
    List<Task> all();

    @Insert('insert into TASK (name, description, status_code) values(#{name}, #{description}, #{status_code})')
    long add(Task task);
}
