package org.kesina.angular.swe642;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.ws.rs.Consumes;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;


@Path("Survey")
public class SurveyService {

	@GET
	@Path("/student/{i}")
	@Produces("application/json")
	public Student findStudent(@PathParam("i") String i) {
		System.out.println("ALL DATA READ");
		Student student = DatabaseService.find(i);
		System.out.println(student);
		return student;
	}

	@Path("/students")
	@GET
	@Produces({ "application/json" })
	public List<Student> findAll() {
		System.out.println("ALL DATA READ");
		List<Student> students = DatabaseService.findAll();
		System.out.println(students.get(0).getStudentId());
		return students;
	}

	@Path("/save")
	@POST
	@Consumes("application/x-www-form-urlencoded")
	@Produces("application/json")
	public Response save(String entity) {
		System.out.println("SAVE-----+------------" + entity);
		Gson gson = new Gson();
		Student dto = gson.fromJson(entity, Student.class);
		List<Student> students = new ArrayList<Student>();
		try {
			saveData(dto);
		} catch (Exception e) {
			System.out.println(e);
			e.printStackTrace();
			return Response.status(500).build();
		}
		return Response.status(200).build();

	}

	public static void saveData(Student req) {
		EntityManagerFactory emf = null;
		emf = DatabaseService.getEntityManager(emf);
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = null;
		try {
			System.out.println("IN IN IN");
			et = em.getTransaction();
			et.begin();
			Student sb = new Student();
			sb.setStudentId(req.getStudentId());

			sb.setUsername(req.getUsername());
			sb.setStreetAdd(req.getStreetAdd());
			sb.setZipcode(req.getZipcode());
			sb.setCity(req.getCity());
			sb.setState(req.getState());
			sb.setEmail(req.getEmail());
			sb.setPhone(req.getPhone());
			sb.setUrl(req.getUrl());
			sb.setDate_of_survey(req.getDate_of_survey());
			sb.setLikes(req.getLikes());
			sb.setInterest_source(req.getInterest_source());
			sb.setAdditional_comment(req.getAdditional_comment());
			sb.setYear(req.getYear());
			sb.setGraduation_month(req.getGraduation_month());
			sb.setLikely_to_recommend(req.getLikely_to_recommend());
			sb.setData(req.getData());
			DataBean db = DataProcessor.cal(req.getData());
			sb.setMean(db.getMean());
			sb.setStdDev(db.getStdDev());

			em.persist(sb);
			et.commit();

		} catch (Exception ex) {
			System.out.println(ex);
			if (et != null)
				et.rollback();
		} finally {
			System.out.println("CLOSED");
			em.close();
		}
	}

}