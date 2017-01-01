package jp.co.nichiwa_system.example.tasks

import org.junit.Test

public class TaskStatusTest {
    @Test
    void "ステータスコードからステータスを取得"() {
        assert Task.Status.byCode(1) == Task.Status.todo
        assert Task.Status.byCode(2) == Task.Status.doing
        assert Task.Status.byCode(3) == Task.Status.done
    }
}
