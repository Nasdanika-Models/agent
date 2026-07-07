An [Ecore](https://medium.com/nasdanika/modeling-democracy-how-ecore-and-visual-first-workflows-put-mbse-back-in-human-hands-12d6bb426bf3)/Xcore metamodel for agentic AI systems: agents (personas), tasks, tools, skills, examples, and the language models behind them.
It is deliberately framework-neutral: the vocabulary is the general agentic lingo (system prompts, tool parameters as JSON Schema, MCP tools, skills, handoffs) rather than the dialect of any single framework.

This is an early publication to stake the ground and collect feedback. The metamodel comes first; tooling follows.

```drawio-resource
../agent.drawio
```

[TOC levels=6]

## Motivation

Agent frameworks keep multiplying and merging, but the concepts underneath have converged: an agent is a persona (instructions) bound to a model, equipped with tools, skills, and examples, performing tasks that may depend on each other.
Every framework spells this slightly differently, and every framework buries it in code.

That burial is the real problem. An agent definition is a specification of behavior, and the people best qualified to author and review that behavior are usually subject matter experts, not developers.
The same holds for the people who must sign off on it: business owners, technical owners, information security.
Today they are asked to review Python.
A typed model changes the workflow:

* **SMEs author or co-author agents** in forms they can work with (YAML, Excel, [Draw.io](https://medium.com/nasdanika/draw-first-execute-later-iterate-forever-d6ac29d7aba5)), with the metamodel validating structure as they go.
* **Generated documentation is the spec.** Every agent, task, tool, and skill renders to a browsable HTML site: what the agent does, which tools it can call with which parameters, which examples shape its behavior, who owns it. Reviewers review that, not source code.
* **The definition is version-controlled and diffable.** "What changed in this agent between releases" becomes a semantic diff, not a code archeology exercise.

At the very least the model produces a spec: generated documentation. Execution is the next step, not a precondition for value.

## Core concepts

* **AgentSystem**: the root container holding models, agents, tasks, tools, and skills.
* **Llm**: a language model with provider, identifier, and inference settings. Deployment specifics (endpoints, credentials) belong in a separate deployment model.
* **Agent**: a persona bound to a model. Instructions (the system prompt) are the persona; tools, skills, example sets, and handoffs to other agents are capability wiring.
* **Task**: a unit of work with expected output (its acceptance criteria), a performing agent, typed inputs, and dependencies on other tasks.
* **Tool**: a typed capability with JSON-Schema-aligned parameters. Subclasses bind declaration to implementation: `McpTool` (an [MCP](https://modelcontextprotocol.io/) server tool), `JavaTool` (a JVM implementation class), `AgentTool` (an agent exposed as a tool, the delegation pattern).
* **Skill**: procedural knowledge loaded on demand, in the sense of [Anthropic Agent Skills](https://www.anthropic.com/news/skills): Markdown instructions plus supporting resources.
* **Example / ExampleSet / SelectionStrategy**: few-shot examples as first-class elements. Which examples enter a prompt is a retrieval policy, not a static list: include all, or select by similarity, with the strategy pluggable per example set.
* **Actors and roles**: every model element can carry ownership, e.g. a business owner, a technical owner, and an information security owner, following the actor/role approach of the [Product Management model](https://product-management.models.nasdanika.org). Ownership makes review workflows generable: the information security view of an agent system is a filtered rendering of the same model.

## How this relates to the industry landscape

The landscape has been converging on declarative agent definitions, which validates the direction and sharpens what this model is for:

* **[Open Agent Spec](https://www.openagentspec.dev/)** is a declarative YAML language for cross-framework agent definitions with a conformance suite. It is an import source and an export target for this model, not a competitor: Agent Spec is an interchange format, this is a typed metamodel with cross-referencing, validation, and a generation pipeline behind it.
* **[Microsoft Agent Framework](https://learn.microsoft.com/en-us/agent-framework/overview/)** (the merger of Semantic Kernel and AutoGen) added declarative YAML/JSON agent definitions: a generation target. The merger itself illustrates why the neutral core matters: my [Semantic Kernel metamodel](https://semantic-kernel.models.nasdanika.org/) now describes a framework in maintenance mode. Framework-specific metamodels rot; a neutral metamodel with bindings does not.
* **[OASF](https://docs.agntcy.org/oasf/open-agentic-schema-framework/)** and [A2A](https://a2a-protocol.org/) agent cards standardize agent capability descriptions for discovery: export targets generable from the same model that produced the documentation.
* **[MCP](https://modelcontextprotocol.io/)** is how tools are actually shipped in 2026; `McpTool` makes MCP-provided tools first-class model elements.
* My existing [CrewAI](https://crew-ai.models.nasdanika.org/) and [Semantic Kernel](https://semantic-kernel.models.nasdanika.org/) metamodels become bindings: transformations from this model to framework-specific models. [OpGraph](https://op-graph.models.nasdanika.org/) provides the execution-graph substrate for orchestration beyond simple task dependencies.

What none of the above offer, and this model does: generated documentation as the primary artifact, ownership roles on every element, and membership in a larger modeled ecosystem (capabilities, [product management](https://product-management.models.nasdanika.org), [semantic mapping](https://medium.com/nasdanika/semantic-mapping-3ccbef5d6c70)) rather than a standalone spec.

## Executable model: generate or interpret

The model is executable in two ways:

* **Generation**: emit definitions for a target framework or spec (Open Agent Spec, Microsoft Agent Framework declarative agents, CrewAI, agent cards) and let that runtime execute.
* **Interpretation**: a Java interpreter executes the model directly on the JVM. The Java agentic space is thin relative to Python and TypeScript, and organizations with large Java estates should not have to leave the JVM to run agents. `JavaTool` binds tool declarations to implementation classes; MCP covers everything else.

Either way, the documentation is generated from the same source, so the spec and the runtime cannot drift apart.

## Related Nasdanika capabilities

* [Nasdanika core](https://github.com/Nasdanika/core): capability framework, resource loading (YAML, Excel, Draw.io), generation pipeline.
* [Nasdanika CLI](https://github.com/Nasdanika/cli): command chains for validation, documentation, and site generation.
* [Product Management model](https://product-management.models.nasdanika.org): actors, roles, and ownership; agents and agent systems are products with owners and lifecycles.
* [Semantic mapping / NSML](https://medium.com/nasdanika/semantic-mapping-3ccbef5d6c70): mapping between this metamodel and framework-specific representations as versioned, shareable artifacts.
* [Executable graphs and diagrams](https://medium.com/nasdanika/general-purpose-executable-graphs-and-diagrams-8663deae5248): orchestration topologies beyond linear task dependencies.

## Status and feedback

The metamodel (`agent.xcore`) is the current deliverable. If you are building agents in a framework whose concepts do not fit this model, or reviewing agents you cannot meaningfully inspect, I'd like to hear where it does not fit your reality: open an issue.

More context: [docs.nasdanika.org](https://docs.nasdanika.org/index.html) and the [Nasdanika Medium publication](https://medium.com/nasdanika/all).
