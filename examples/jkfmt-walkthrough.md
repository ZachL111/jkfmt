# Jkfmt Walkthrough

The fixture is intentionally compact, so the review starts with the cases that pull farthest apart.

| Case | Focus | Score | Lane |
| --- | --- | ---: | --- |
| baseline | change width | 153 | ship |
| stress | diagnostic quality | 169 | ship |
| edge | review cost | 202 | ship |
| recovery | safe rewrite | 207 | ship |
| stale | change width | 153 | ship |

Start with `recovery` and `baseline`. They create the widest contrast in this repository's fixture set, which makes them better review anchors than the middle cases.

The next useful expansion would be a malformed fixture around diagnostic quality and safe rewrite.
