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
return "Hello World - training for Developer !!!";
}

@RequestMapping("/scrumtraining")
public String scrumtraining() {
return "Hello World - training for Scrum Masters !!!";
}  
  
}
