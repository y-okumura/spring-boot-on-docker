package jp.co.nichiwa_system.example.tasks

import org.junit.Test

public class TaskTest {

    @Test
    void ステータスコードの初期値はtodo() {
        def task = new Task()
        assert task.status == Task.Status.todo
    }

    @Test
    void "ステータスコードを1に設定するとステータスがtodoに設定される"() {
        def task = new Task()
        task.status = null
        task.status_code = 1
        assert task.status == Task.Status.todo
    }

    @Test
    void "ステータスコードを２に設定するとステータスがdoingに設定される"() {
        def task = new Task()
        task.status_code = 2
        assert task.status == Task.Status.doing
    }

    @Test
    void "ステータスコードを3に設定するとステータスがdoneに設定される"() {
        def task = new Task()
        task.status_code = 3
        assert task.status == Task.Status.done
    }

    @Test
    void "ステータスコードを1〜3以外に設定するとステータスがnullに設定される"() {
        def task = new Task()

        task.status_code = 0
        assert task.status == null

        task.status = Task.Status.todo
        task.status_code = 4
        assert task.status == null
    }
}
