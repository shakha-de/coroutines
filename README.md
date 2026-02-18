# Coroutines / Nebenläufigkeit

## Deutsch

Dieses Repository enthält einfache Vergleichsbeispiele zur Nebenläufigkeit in mehreren Programmiersprachen (u. a. Go, Java, Kotlin und Python).

Es ist im Kontext meines Uni-Moduls entstanden:

**„Gestaltung und Durchführung von Fachvorträgen in der Informatik: Softwaretechnik und Programmiersprachen“**

Die Beispiele zeigen jeweils CPU-lastige und sleep-/wartezeitbasierte Szenarien, um Laufzeitverhalten und Threading-/Coroutine-Konzepte gegenüberzustellen.

### Kurz: Vor- und Nachteile

**Vorteile**
- Gute Vergleichbarkeit von Nebenläufigkeitsmodellen über mehrere Sprachen.
- Anschauliche Beispiele für I/O-nahe (sleep) und CPU-lastige Workloads.
- Reproduzierbare Ausführung über CI-Workflows.

**Nachteile**
- Benchmarks in CI können durch Runner-Schwankungen verfälscht sein.
- Workloads sind vereinfacht und nicht vollständig repräsentativ für produktive Systeme.
- Unterschiede bei Runtime/Thread-Modellen sind nicht immer 1:1 fair vergleichbar.

## English

This repository contains simple concurrency comparison examples across multiple programming languages (including Go, Java, Kotlin, and Python).

It was created in the context of my university module:

**"Gestaltung und Durchführung von Fachvorträgen in der Informatik: Softwaretechnik und Programmiersprachen"**

The examples cover both CPU-bound and sleep/wait-based scenarios to compare runtime behavior and threading/coroutine concepts.

### Brief: Pros and Cons

**Pros**
- Clear cross-language comparison of concurrency models.
- Understandable examples for both I/O-like (sleep) and CPU-bound workloads.
- Reproducible execution via CI workflows.

**Cons**
- CI benchmark noise can affect timing consistency.
- Workloads are simplified and not fully representative of production systems.
- Different runtime/threading models are not always directly comparable 1:1.