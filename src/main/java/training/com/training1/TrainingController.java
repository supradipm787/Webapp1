package training.com.training1;


import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
/**
 *
 * @author manoj.bardhan
 *
 */
@RestController
public class TrainingController {
@RequestMapping("/devtraining")
public String index() {
return "Hello - GD & training for Developers of Cybage on Domain Driven design & Microservice Architecture by 18th Feb 2023 !!!!!!!!";
}

@RequestMapping("/scrumtraining")
public String scrumtraining() {
return "Hello - GD & training on Scrum Master & Product Owner to Project Managers of Cybage by 1st June 2023!!!!!!";
}  
  
}
