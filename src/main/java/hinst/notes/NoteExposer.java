package hinst.notes;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class NoteExposer {
	
	@Autowired
	NoteRepository noteRepository;
	
	@RequestMapping("/notes")
	Collection<Note> getNotes() {
		return noteRepository.findAll();
	}

}
