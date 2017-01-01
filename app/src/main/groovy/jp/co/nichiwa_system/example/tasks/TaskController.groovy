package jp.co.nichiwa_system.example.tasks

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import org.springframework.web.servlet.view.RedirectView

@RestController
@RequestMapping('/task')
public class TaskController {

    @Autowired
    private TaskMapper mapper;

    @RequestMapping(method = RequestMethod.GET)
    public List<Task> all() {
        return mapper.all();
    }

    @RequestMapping(method = RequestMethod.POST)
    public RedirectView add(Task task) {
        mapper.add(task);
        return new RedirectView('task');
    }
}
