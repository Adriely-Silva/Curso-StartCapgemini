package Questao05;

public class Student {
	
	private Integer enrolment;
	
	private String name;
	
	private Double noteForTheFirstTest;
	
	private Double noteForTheSecundTest;
	
	private Double workNote;
	
	public Student() {
		
	}

	public Integer getEnrolment() {
		return enrolment;
	}

	public void setEnrolment(Integer enrolment) {
		this.enrolment = enrolment;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getNoteForTheFirstTest() {
		return noteForTheFirstTest;
	}

	public void setNoteForTheFirstTest(Double noteForTheFirstTest) {
		this.noteForTheFirstTest = noteForTheFirstTest;
	}

	public Double getNoteForTheSecundTest() {
		return noteForTheSecundTest;
	}

	public void setNoteForTheSecundTest(Double noteForTheSecundTest) {
		this.noteForTheSecundTest = noteForTheSecundTest;
	}

	public Double getWorkNote() {
		return workNote;
	}

	public void setWorkNote(Double workNote) {
		this.workNote = workNote;
	}
	
	public Double finalAverage() {
		Double testScore = 2.5 * (getNoteForTheFirstTest() + getNoteForTheSecundTest());
		Double workScore = 2 * getWorkNote();
		return (testScore + workScore) / 7 ;
	}
	
	public Double finalTest() {
		Double average = finalAverage();
		if (average >= 6) {
			return 0.0;
		} else {
			
			
		}	
		return null;
	}
	
	@Override
	public String toString() {
		return  "O aluno precisa tirar no mínimo: " + finalTest();
	}
	
}
