package hinst.notes;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;

interface NoteRepository extends JpaRepository<Note, Long> {

	Collection<Note> findNoteById(Long id);
	
}
