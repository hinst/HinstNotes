package hinst.notes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NoteWebUI {
	
	@Autowired
	NoteRepository noteRepository;
	
	@RequestMapping("/status")
	public String getStatus(Model model) {
		model.addAttribute("countOfNotes", noteRepository.count());
		return "status.html";
	}

}
