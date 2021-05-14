package hello.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.List;

public class JpaMain {
    public static void main(String[] args) {
         EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
         EntityManager em = emf.createEntityManager();

         EntityTransaction tx = em.getTransaction();
         tx.begin();

         try {
//             // 비영속
//             Member member = new Member();
//             member.setId(101L);
//             member.setName("HelloJPA");
//
//             // 영속
//             System.out.println("=== BEFORE ===");
//             em.persist(member);
//             System.out.println("=== AFTER ===");
//
//             Member findMember = em.find(Member.class, 101L);
//
//             System.out.println("findMember.id = " + findMember.getId());
//             System.out.println("findMember.name = " + findMember.getName());

             // 1차 캐시(영속 엔티티의 동일성 보장)
//             Member findMember1 = em.find(Member.class, 101L);
//             Member findMember2 = em.find(Member.class, 101L);
//             System.out.println(findMember1==findMember2);

             // 쓰기 지연
             // 커밋할때 쿼리들이 날라간다.
//             Member member1 = new Member(150L,"A");
//             Member member2 = new Member(160L,"B");
//
//             em.persist(member1);
//             em.persist(member2);
//
//             System.out.println("====");

             tx.commit();
         }catch (Exception e){
             tx.rollback();
         } finally {
             em.close();

         }

         emf.close();
    }
}
