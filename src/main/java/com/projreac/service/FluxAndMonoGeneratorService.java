package com.projreac.service;

import java.util.List;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class FluxAndMonoGeneratorService {

	public Flux<String> namesFlux() {
		return Flux.fromIterable(List.of("alex", "ben", "chaela")).log();
	}

	public Flux<String> namesFluxFlatMap() {
		return Flux.fromIterable(List.of("alex", "ben", "chaela")).flatMap(s-> splitString(s)).log();
	}

	public Flux<String> splitString(String name) {
		var charArray = name.split("");
		return Flux.fromArray(charArray);

	}

	public Flux<String> namesFluxMap() {
		return Flux.fromIterable(List.of("alex", "ben", "chaela")).map(String::toUpperCase).log();
	}

	public Mono<String> nameMono() {
		
		return Mono.just("alex");
		
		
		
	}

	public static void main(String args[]) {

		FluxAndMonoGeneratorService fluxAndMonoGeneratorService = new FluxAndMonoGeneratorService();
	//	fluxAndMonoGeneratorService.namesFluxFlatMap().subscribe(name -> System.out.println(name));

		var a = "pr";
		var h = 5;
		var h1 = a + h;
		System.out.print(h1);
		

		// fluxAndMonoGeneratorService.nameMono().subscribe(name ->
		// System.out.println(name));

	}

}
