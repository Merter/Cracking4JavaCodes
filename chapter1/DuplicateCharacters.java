

public class DuplicateCharacters {

// abaac => abc
// abc => abc
// abbababbbaaabbba => ab
// abbababbcbaaabbba => abc

	public void removeDuplicateChars(char[] content) {
		int pos = 1;
		for (int i=1; i<content.length; i++) {
			boolean found = false;
			for (int j=pos-1; j>=0; j--) {
				if (content[i] == content[j]) {
					found = true;
					break;
				}
			}
			if (!found)
				content[pos++] = content[i];
		}	
	
		// put the '\0' to the end
		content[pos] = '\0';
	}
}
