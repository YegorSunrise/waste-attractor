package starter;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/waste")
public class AttractorController {

    @PostMapping()
    @ResponseStatus(value = HttpStatus.OK, reason = "blah blah")
    public void create(@RequestBody String body){
        System.out.println("attract waste: " + body);
    }

    @GetMapping()
    public void print(){
        System.out.println("triggered GET");
    }
}
