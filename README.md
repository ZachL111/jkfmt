# jkfmt

`jkfmt` explores developer tools in Java. The repository keeps the core rule set compact, then surrounds it with examples that show how the decisions move.

## Jkfmt Notes

The quickest review path is the verifier first, then the fixtures, then the operations note. That order makes it easy to see whether the code, data, and explanation still agree.

## Why This Exists

This is not a wrapper around a service. It is a self-contained project that shows how the model behaves when demand, capacity, latency, risk, and weight move in different directions.

## Feature Notes

- Models code shape with deterministic scoring and explicit review decisions.
- Uses fixture data to keep diagnostics changes visible in code review.
- Includes extended examples for safe defaults, including `recovery` and `degraded`.
- Documents repeatable output tradeoffs in `docs/operations.md`.
- Runs locally with a single verification command and no external credentials.

## Implementation Notes

The project is organized around a compact model rather than a large framework. Inputs are scored, classified, and checked against golden fixtures. The constants live in code and are mirrored in metadata so documentation drift is easy to catch. The Java implementation uses a compact package layout and direct assertion checks.

## Code Tour

- `src`: primary implementation
- `tests`: verification harness
- `fixtures`: compact golden scenarios
- `examples`: expanded scenario set
- `metadata`: project constants and verification metadata
- `docs`: operations and extension notes
- `scripts`: local verification and audit commands

## Local Setup

Use a normal shell with Java available on `PATH`. The verifier is written as a PowerShell script because the portfolio was assembled on Windows.

## Try It

```powershell
powershell -NoProfile -ExecutionPolicy Bypass -File scripts/verify.ps1
```

This runs the language-level build or test path against the compact fixture set.

## Tests

```powershell
powershell -NoProfile -ExecutionPolicy Bypass -File scripts/audit.ps1
```

The audit command checks repository structure and README constraints before it delegates to the verifier.

## Example Scenarios

`baseline` is the first example I would inspect because it lands on the `review` path with a score of 93. The broader file also keeps `degraded` at -71 and `recovery` at 192, which gives the model a useful low-to-high spread.

## Boundaries

The repository favors determinism over breadth. It does not pull live data, keep secrets, or depend on network access for verification.

## Roadmap

- Add a comparison mode that shows how decisions change when one signal is adjusted.
- Add a loader for `examples/extended_cases.csv` and promote selected cases into the language test suite.
- Add a short report command that prints the score breakdown for a single scenario.
- Add one more developer tools fixture that focuses on a malformed or borderline input.
