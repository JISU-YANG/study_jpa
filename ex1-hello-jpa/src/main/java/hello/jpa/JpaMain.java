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
             // 멤버 추가
//             Member member = new Member();
//             member.setId(1L);
//             member.setName("HelloA");
//             em.persist(member);

             // 멤버 조회
//             Member findMember = em.find(Member.class,1L);
//             System.out.println(findMember.getId());
//             System.out.println(findMember.getName());

             // 멤버 삭제
//             Member findMember = em.find(Member.class,1L);
//             em.remove(findMember);

             // 멤버 수정
//             Member findMember = em.find(Member.class,1L);
//             findMember.setName("HelloJPA");

             // JPQL(객체 지향 쿼리 언어)
//             List<Member> result = em.createQuery("select m from Member as m", Member.class)
//                     .getResultList();
//             for (Member member : result) {
//                 System.out.println(member.getName());
//             }
             
             tx.commit();
         }catch (Exception e){
             tx.rollback();
         } finally {
             em.close();

         }

         emf.close();
    }
}
