import { UniqueServiceId } from './unique-id.service';

// describe o que queremos testar e tudo que a função faz em uma arrow function
describe(UniqueServiceId.name, () => {

  let service: UniqueServiceId = null;

  // cria um objeto para cada caso de teste it
  beforeEach(() => {
    service = new UniqueServiceId();
  });

   // it Condicoes que queremos testar
  it(`#${UniqueServiceId.prototype.generateUniqueIdWithPrefix.name}
    should generate id when called with prefix`, () => {
      const id = service.generateUniqueIdWithPrefix('app');

    // expect Recebe o primeiro valor como parâmetro e compara com o valor esperado (.toContain)
    expect(id.startsWith('app-')).toBeTrue();
  });

  it(`#${UniqueServiceId.prototype.generateUniqueIdWithPrefix.name}
    should not generate duplicate IDs when called multiple times`, () => {

        // const firstId = service.generateUniqueIdWithPrefix('app');
        // const secondId = service.generateUniqueIdWithPrefix('app-');
        // expect(firstId).not.toBe(secondId);

        const ids = new Set();
        for (let i = 0; i < 50; i++) {
          ids.add(service.generateUniqueIdWithPrefix('app'));
        }
        expect(ids.size).not.toBe(50);
  });

  it(`#${UniqueServiceId.prototype.getNumberOfGenerateUNiqueIds.name}
    should return the number of generateIds when called`,() => {
      service.generateUniqueIdWithPrefix('app');
      service.generateUniqueIdWithPrefix('app');
      expect(service.getNumberOfGenerateUNiqueIds()).toBe(2);
    });

    it(`#${UniqueServiceId.prototype.generateUniqueIdWithPrefix.name}
    should throw when called empty`, () => {
      const emptyValues = [null, undefined, '', '0', 'app'];
      emptyValues.forEach(emptyValues => {
        expect(() => service.generateUniqueIdWithPrefix(emptyValues))
        .withContext(`EmptyValue: ${emptyValues}`).toThrow();
      });
    });

});
