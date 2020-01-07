//ProbeLList.java
//Matthew Robinson  101047308
//November 14, 2019
//This class defines the functions required for the port scan database to operate
import java.util.ArrayList;

public class ProbeLList {
	private ProbeNode head;
	private ProbeNode tail;

	public ProbeLList() {
	}

	public ProbeLList(ProbeLList aList) {
		ProbeNode list = aList.head; // Copied list, starting with the head of the list to copy
		ProbeNode tempHead = this.head;// Keeping track of where we are in the list

		// Deep copy of aList
		while (list != null) {
			tempHead = new ProbeNode(list.aProbe);
			list = list.next;
			tempHead = tempHead.next;

		}
	}

	// Returns the length of the list by cycling through it
	public int getActualsz() {
		int size = 0;
		ProbeNode fetcher = head; // This is a temp ProbeNode to cycle through the list

		while (fetcher.next != null) {
			fetcher = fetcher.next;
			size++;
		}
		return size;
	}

	// Inserts a probe to the end of the list
	public int insertProbe(Probe probe) {
		ProbeNode newProbe = new ProbeNode(probe);
		if (head == null) { // This checks if the list is empty and adds the new probe to the list
			head = newProbe;
			tail = head;

		}

		// Creates a node with the passed probe and adds it to the end of the list
		else {
			newProbe.next = null;
			tail.next = newProbe;
			tail = tail.next;
		}
		return getActualsz();
	}

	// Cycles through the list, comparing each originP to the parameter
	// increments the matches counter with each match and returns it
	public int countProbes(String ip) {
		int matches = 0;
		ProbeNode fetcher = this.head;

		while (fetcher != null) {
			if (fetcher.aProbe.getOriginIP().equals(ip)) {
				matches++;
			}

			fetcher = fetcher.next;
		}
		return matches;
	}
