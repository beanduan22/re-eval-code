# Re-evaluation Code Examples

This repository stores representative baseline attack samples for manual
re-evaluation.

The full records are in
[`examples/baseline_failure_examples.json`](examples/baseline_failure_examples.json).
Each record includes:

- method, model, task, dataset, and sample index
- audit result and failure type
- replacement metadata
- original code sample
- adversarial code sample

## Included Samples

| Method | Model | Task | Index | Failure type | Summary |
| --- | --- | --- | --- | --- | --- |
| ALERT | CodeBERT | CloneDetection | 7 | syntax error | Identifier replacements corrupt method calls and declarations. |
| BEAM | CodeT5 | CloneDetection | 756 | binding/compile error | Renaming maps two locals in the same scope to `file`. |
| CODA | CodeBERT | CloneDetection | 90 | syntax error | Inserted Java string literals contain raw newlines. |
| ITGEN | CodeBERT | CloneDetection | 20 | syntax error | Replacement corrupts expressions and loop syntax. |

