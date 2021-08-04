package com.projreac.service;

import org.junit.jupiter.api.Test;

import reactor.test.StepVerifier;

public class FluxAndMonoGeneratorTest {

	FluxAndMonoGeneratorService fluxAndMonoGeneratorService = new FluxAndMonoGeneratorService();

	@Test
	void namesFlux() {
		// given

		// when
		var namesFlux = fluxAndMonoGeneratorService.namesFlux();
		var namesFluxMap = fluxAndMonoGeneratorService.namesFluxMap();


		// then

		//StepVerifier.create(namesFlux).expectNext("alex", "ben", "chaela").verifyComplete();
	//	StepVerifier.create(namesFlux).expectNextCount(3).verifyComplete();
		
		//StepVerifier.create(namesFlux).expectNext("alex").expectNextCount(2).verifyComplete();
		
		StepVerifier.create(namesFluxMap).expectNext("ALEX").expectNextCount(2).verifyComplete();


	}
}
