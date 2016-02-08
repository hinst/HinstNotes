package hinst.notes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class NoteExposer {
	
	@Autowired
	NoteRepository noteRepository;
	
	@RequestMapping("/notes/count")
	Long getNotes() {
		return noteRepository.count();
	}

}
