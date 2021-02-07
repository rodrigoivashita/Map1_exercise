package entities;

public class Vote {
	
	private String candidate;
	private Integer vote;
	
	public Vote(String candidate, Integer vote) {
		this.candidate = candidate;
		this.vote = vote;
	}

	public String getCadidate() {
		return candidate;
	}

	public void setCadidate(String candidate) {
		this.candidate = candidate;
	}

	public Integer getVote() {
		return vote;
	}

	public void setVote(Integer vote) {
		this.vote = vote;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((candidate == null) ? 0 : candidate.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vote other = (Vote) obj;
		if (candidate == null) {
			if (other.candidate != null)
				return false;
		} else if (!candidate.equals(other.candidate))
			return false;
		return true;
	}	
}
