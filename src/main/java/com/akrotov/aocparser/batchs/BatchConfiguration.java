package com.akrotov.aocparser.batchs;

import javax.sql.DataSource;

import com.akrotov.aocparser.models.Person;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.item.*;
import org.springframework.batch.item.database.BeanPropertyItemSqlParameterSourceProvider;
import org.springframework.batch.item.database.JdbcBatchItemWriter;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.mapping.BeanWrapperFieldSetMapper;
import org.springframework.batch.item.file.mapping.DefaultLineMapper;
import org.springframework.batch.item.file.transform.DelimitedLineTokenizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.core.JdbcTemplate;

import java.net.URL;

@Configuration
@EnableBatchProcessing
public class BatchConfiguration {

    // tag::readerwriterprocessor[]
    @Bean
    public ItemReader<Cat> reader() {
        FlatFileItemReader<Cat> reader = new FlatFileItemReader<Cat>();

        // Установили ссылку

        URL url1 = null;
        URL url2 = null;
        URL url3 = null;

        return new HTTPReader();


     /*   reader.setResource(new ClassPathResource("sample-data.csv"));


        reader.setLineMapper(new DefaultLineMapper<String>() {{
            setLineTokenizer(new DelimitedLineTokenizer() {{
                setNames(new String[]{"firstName", "lastName"});
            }});
            setFieldSetMapper(new BeanWrapperFieldSetMapper<String>() {{
                setTargetType(String.class);
            }});
        }});
        return reader;
        // Получаем страницу html (дом дерево)*/
    }

    public static class HTTPReader implements ItemReader<Cat> {

        @Override
        public Cat read() throws Exception, UnexpectedInputException, ParseException, NonTransientResourceException {
            return null;
        }
    }

    @Bean
    public ItemProcessor<Person, Person> processor() {
        // Парсим страницу, собираем объекты
        return null;
    }

    @Bean
    public ItemWriter<Person> writer(DataSource dataSource) {
        // Пишем в базу
        return null;
    }
    // end::readerwriterprocessor[]

    // tag::jobstep[]
    @Bean
    public Job importUserJob(JobBuilderFactory jobs, Step s1) {
        return jobs.get("importUserJob")
                .incrementer(new RunIdIncrementer())
                .flow(s1)
                .end()
                .build();
    }

    @Bean
    public Step step1(StepBuilderFactory stepBuilderFactory, ItemReader<Person> reader,
                      ItemWriter<Person> writer, ItemProcessor<Person, Person> processor) {
        return stepBuilderFactory.get("step1")
                .<Person, Person>chunk(10)
                .reader(reader)
                .processor(processor)
                .writer(writer)
                .build();
    }
    // end::jobstep[]

    @Bean
    public JdbcTemplate jdbcTemplate(DataSource dataSource) {
        return new JdbcTemplate(dataSource);
    }

}