# jkfmt

`jkfmt` is a compact Java repository for developer tools, centered on this goal: Format JSON with stable key ordering and selector output checks.

## Project Rationale

This is intentionally local and self-contained so it can be inspected without credentials, services, or seeded history.

## Jkfmt Review Notes

Start with `safe rewrite` and `change width`. Those cases create the widest score spread in this repo, so they are the best quick check when the model changes.

## Feature Set

- `fixtures/domain_review.csv` adds cases for change width and diagnostic quality.
- `metadata/domain-review.json` records the same cases in structured form.
- `config/review-profile.json` captures the read order and the two review questions.
- `examples/jkfmt-walkthrough.md` walks through the case spread.
- The Java code includes a review path for `safe rewrite` and `change width`.
- `docs/field-notes.md` explains the strongest and weakest cases.

## Architecture

The fixture data drives the tests. The code stays thin, while `metadata/domain-review.json` and `config/review-profile.json` explain what each case is meant to protect.

The Java implementation avoids hidden state so fixture changes are easy to reason about.

## Usage

```powershell
powershell -NoProfile -ExecutionPolicy Bypass -File scripts/verify.ps1
```

## Test Command

The same command runs the local verification path. The highest-scoring domain case is `recovery` at 207, which lands in `ship`. The most cautious case is `baseline` at 153, which lands in `ship`.

## Next Improvements

No external service is required. A deeper version would add more negative cases and a clearer boundary around invalid input.
