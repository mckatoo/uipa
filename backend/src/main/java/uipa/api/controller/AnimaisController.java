package uipa.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * AnimaisController
 */

@RestController
public class AnimaisController {

  @GetMapping(path = "api/animais")
  public String consultar() {
    return "animais";
  }

}
